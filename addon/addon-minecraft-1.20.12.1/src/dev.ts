import { execFile } from "child_process";
import * as fs from 'fs-extra';
import { config } from "dotenv"
import path from "path";

config();

const addon_path = process.env.ADDON_PATH;
const addon_rp_name = process.env.ADDON_RP_PATH;
const addon_bp_name = process.env.ADDON_BP_PATH;

const minecraft_path = process.env.MINECRAFT_APP_PATH;
const minecraft_rp_dev_path = process.env.MINECRAFT_RP_DEVELOPMENT_PATH;
const minecraft_bp_dev_path = process.env.MINECRAFT_BP_DEVELOPMENT_PATH;

async function moveRpAndBpToDevFolderPath() {
    try {
        await fs.remove(`${minecraft_rp_dev_path!}/${addon_rp_name}`);
        await fs.remove(`${minecraft_bp_dev_path!}/${addon_bp_name}`);
        await fs.copy(`${addon_path}/${addon_rp_name!}`,`${minecraft_rp_dev_path!}/${addon_rp_name}`);
        await fs.copy(`${addon_path}/${addon_bp_name!}`,`${minecraft_bp_dev_path!}/${addon_bp_name}`);
        console.log("Berhasil memindahkan addon ke development path.")
    } catch (error) {
        console.log("Gagal memindahkan addon ke development path.")
    }
}

function openMinecraft(): void {
    try {
        execFile('explorer.exe', [path.resolve(minecraft_path!)]);
        console.log("Berhasil membuka Minecraft.")
    } catch (error) {
        console.log("Gagal membuka Minecraft.")
    }
}

async function main() {
    await moveRpAndBpToDevFolderPath();
    openMinecraft();   
}

main();
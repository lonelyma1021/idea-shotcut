package me.toshiba.practice.shortcut.editing;

import me.toshiba.practice.shortcut.materiel.Persion;

/**
 * 快速查看JavaDoc文档
 *
 * @description 快速查看JavaDoc文档
 * @shotcut Ctrl + Q
 */
public class Ctrl_Q {

    private void showUsage() {
        /**
         * 将光标定位到'printPersonalInfo'方法名任意位置
         * 点击 Ctrl + Q
         * 将光标定准到'Persion'类名任意位置
         */
        Persion.printPersonalInfo("toshiba", 30, 173, 66.5, "");
    }
}

package me.toshiba.practice.shortcut.editing;

import me.toshiba.practice.shortcut.materiel.Persion;

/**
 * 显示参数信息
 *
 * @description 显示方法参数提示信息
 * @shortcut Ctrl + P
 */
public class Ctrl_P {

    private void showUsage() {
        /**
         * 将光标定位到方法调用代码除第一字符和最后字符外的任意位置
         * 点击 Ctrl + P
         */
        Persion.printPersonalInfo();
    }
}

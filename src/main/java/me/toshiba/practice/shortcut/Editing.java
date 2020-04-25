package me.toshiba.practice.shortcut;

/**
 * 代码编辑相关操作快捷键练习
 *
 * @author toshiba
 */
public class Editing {

    /**
     * 功能：单行代码注释
     * 快捷键：Ctrl+/
     */
    public void singleLineComment() {
        /**
         * 将光标定位至21行（跳转指定行参考{@link Navigation#jumpToLine()）
         * 点击 Ctrl+/ 将代码注释
         * 再次将光标定位至21行
         * 再次点击 Ctrl+/ 恢复被注释的代码
         */
        System.out.println("单行代码注释练习");
    }

    /**
     * 功能：代码块注释
     * 快捷键：Ctrl+Shift+/
     */
    public void blockComment() {
        /**
         * 将光标定位至 35 行（跳转指定行参考{@link Navigation#jumpToLine()）
         * 按住 Shift 选中至 39 行尾
         * 点击 Ctrl+Shift+/ 将代码块注释
         * 再次点击 Ctrl+Shift+/ 恢复被注释的代码块
         */
        System.out.println("代码块注释练习");
        System.out.println("代码块注释练习");
        System.out.println("代码块注释练习");
        System.out.println("代码块注释练习");
        System.out.println("代码块注释练习");
    }

    /**
     * 功能：自动补全代码
     * 快捷键：Ctrl+空格
     */
    public void autoComplete() {

    }
}
package me.toshiba.practice.shortcut.editing;

import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 补全语句
 *
 * @description 自动补全语句，包括结尾分号、创建代码块等功能。
 * @shortcut Ctrl + Shift + Enter
 */
public class Ctrl_Shift_Enter {

    /**
     * 将光标定准到 completeMethod方法签名圆括号内
     * 点击 Ctrl + Shift + Enter
     */
    private void completeMethod()

    private void completeStatement() {
        List<String> nameList = new ArrayList<String>(0);
        /**
         * 将光标定位至 'nameList' 后
         * 点击 Ctrl + Shift + Enter
         */
        if (CollectionUtils.isEmpty(nameList))

        /**
         * 将光标定位至圆括号内
         * 输入 'nameList'
         * 点击 Ctrl + Shift + Enter
         */
        queryByList()
    }

    private void queryByList(List<String> list) {

    }

}

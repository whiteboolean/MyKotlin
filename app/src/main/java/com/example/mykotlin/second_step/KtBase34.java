package com.example.mykotlin.second_step;

public class KtBase34 {

    interface IShowResult {
        void result(String result);
    }

    public static void main(String[] args) {

        //匿名函数 -- 匿名接口实现类
        showPersonInfo("lsit", 99, 'm', "学习C语言", new IShowResult() {
            @Override
            public void result(String result) {
                System.out.println(result);
            }
        });

        //具名函数 showResultImpl
        IShowResult mShowResult = new MShowResultImpl();
        showPersonInfo("lsit", 99, 'm', "学习C语言", mShowResult);
    }

    static class MShowResultImpl implements IShowResult {

        @Override
        public void result(String result) {
            System.out.println(result);
        }
    }

    static void showPersonInfo(
            String name,
            int age,
            char sex,
            String study,
            IShowResult iShowResult
    ) {
        String str = String.format("name:%s,age:%d,sex:%c,study:%s", name, age, sex, study);
        iShowResult.result(str);
    }
}

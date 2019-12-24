package com.company;

import com.company.Situation;
public class Story {

    private Situation start_story;
    public Situation current_situation;
    Story[]fut;
    Story(int n) {
        if(n==0) {
            start_story = new Situation(
                    "перед матчем с италией",
                    "Что делать в первую очередь\n "
                            + "(1)Теория\n"
                            + "(2)Практика\n"
                            + "(3)Поиграть в playstation\n"
                            + "(4)посмотреть достопремечательности\n",
                    4,
                    10,
                    20
            );
            start_story.direction[0] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    10,
                    -5
            );
            start_story.direction[1] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    5,
                    0
            );
            start_story.direction[2] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    5,
                    10
            );
            start_story.direction[3] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    0,
                    5
            );
        }
        if(n==1){
            start_story = new Situation(
                    "скоро матч с бразилией",
                    "Чем заняться за день до матча\n "
                            + "(1)Усердно тренироваться. В этом ключ к успеху!2\n"
                            + "(2)День отдыха\n"
                            + "(3)Попробовать подкупить судью2\n"
                            + "(4)Бить по воротам\n",
                    4,
                    30,
                    30
            );
            start_story.direction[0] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    5,
                    0
            );
            start_story.direction[1] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    0,
                    5
            );
            start_story.direction[2] = new Situation("первый день",
                    "Подкупить судей не удалось",
                    0,
                    0,
                    0
            );
            start_story.direction[3] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    5,
                    20
            );
        }
        if(n==2) {
            start_story = new Situation(
                    "Итак, остался решающий матч",
                    "Что же делать?\n "
                            + "(1)Провести психологию\n"
                            + "(2)Обороняться\n"
                            + "(3)Пасоваться\n"
                            + "(4)Бить по воротам\n",
                    4,
                    50,
                    50
            );
            start_story.direction[0] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    20,
                    10
            );
            start_story.direction[1] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    10,
                    20
            );
            start_story.direction[2] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    15,
                    25
            );
            start_story.direction[3] = new Situation("первый день",
                    "Благодаря твоему решению у команды",
                    0,
                    5,
                    20
            );

        }






        current_situation = start_story;
    }

    public void go(int num) {
        if (num <= current_situation.direction.length)
            current_situation = current_situation.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_situation.direction.length + " вариантов");
    }
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
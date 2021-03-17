package com.example.tarotraining;

public class QuestionsSituationSchemaTest {

    private String mQuestions[] = {
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST,
            Constants.WHICH_SCHEMA_IS_DOWN_HERE_CONST
    };

    private String mChoice[] [] = {
            {Constants.RU_ISLAND_OF_BAD_LUCK_CONST, Constants.RU_A_LIGHTED_LANTERN_CONST, Constants.RU_OTELLO_CONST},
            {Constants.RU_ABOUT_YOUR_TALENTS_CONST, Constants.RU_TELEPATHY_CONST, Constants.RU_JOB_CONST},
            {Constants.RU_BALANCING_CONST, Constants.RU_FOUR_CARDS_CONST, Constants.RU_ISLAND_OF_BAD_LUCK_CONST},
            {Constants.RU_STONE_CONST, Constants.RU_CARD_OF_THE_DAY_CONST, Constants.RU_EYE_CONST},
            {Constants.RU_ISLAND_OF_BAD_LUCK_CONST, Constants.RU_SIX_CARDS_OF_DESTINY_CONST, Constants.RU_FLIGHT_OF_THE_SOUL_CONST},
            {Constants.RU_HEALTH_CONST, Constants.RU_TEN_CARDS_CONST, Constants.RU_OTELLO_CONST},
            {Constants.RU_OTELLO_CONST, Constants.RU_TELEPATHY_CONST, Constants.RU_HOURGLASS_CONST},
            {Constants.RU_ISLAND_OF_BAD_LUCK_CONST, Constants.RU_FOUR_CARDS_CONST, Constants.RU_LONDON_FOG_CONST},
            {Constants.RU_JOB_CONST, Constants.RU_ABOUT_YOUR_TALENTS_CONST, Constants.RU_THE_ROAD_OF_WISHES_CONST},
            {Constants.RU_TWO_WINGS_CONST, Constants.RU_WILL_THIS_CONTINUE_CONST, Constants.RU_LONDON_FOG_CONST},
            {Constants.RU_HEALTH_CONST, Constants.RU_TELEPATHY_CONST, Constants.RU_OTELLO_CONST},
            {Constants.RU_FLIGHT_OF_THE_SOUL_CONST, Constants.RU_BETRAYAl_CONST, Constants.RU_TELEPATHY_CONST},
            {Constants.RU_TEN_CARDS_CONST, Constants.RU_THE_ROAD_OF_WISHES_CONST, Constants.RU_WILL_THIS_CONTINUE_CONST},
            {Constants.RU_SIGN_CONST, Constants.RU_THE_ROAD_OF_WISHES_CONST, Constants.RU_JOB_CONST},
            {Constants.RU_TWO_WINGS_CONST, Constants.RU_BUTTERFLY_CONST, Constants.RU_OTELLO_CONST},
            {Constants.RU_WILL_THIS_CONTINUE_CONST, Constants.RU_UMBRELLA_CONST, Constants.RU_BALANCING_CONST}
    };

    private String mImages[] ={
            Constants.A_LIGHTED_LANTERN_CONST,  //Заженный фонарь
            Constants.ABOUT_YOUR_TALENTS_CONST, //О ваших талантах
            Constants.BALANCING_CONST, //Балансирование
            Constants.CARD_OF_THE_DAY_CONST, //Карта дня
            Constants.FLIGHT_OF_THE_SOUL_CONST, //Полет души
            Constants.HEALTH_CONST,  //На самочувствие
            Constants.HOURGLASS_CONST, //Песочные Часы
            Constants.ISLAND_OF_BAD_LUCK_CONST, //Остров невезения
            Constants.JOB_CONST, //Работа
            Constants.LONDON_FOG_CONST, //Лондонский туман
            Constants.OTELLO_CONST, //Отелло
            Constants.TELEPATHY_CONST, //Телепатия
            Constants.TEN_CARDS_CONST, //Десять карт
            Constants.THE_ROAD_OF_WISHES_CONST, //Дорога желаний
            Constants.TWO_WINGS_CONST, //Два крыла
            Constants.WILL_THIS_CONTINUE_CONST //Продолжится ли это?
    };

    private String mQuestionType[] = {
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST
    };

    private String mCorrectAnswer [] = {
            Constants.RU_A_LIGHTED_LANTERN_CONST,
            Constants.RU_ABOUT_YOUR_TALENTS_CONST,
            Constants.RU_BALANCING_CONST,
            Constants.RU_CARD_OF_THE_DAY_CONST,
            Constants.RU_FLIGHT_OF_THE_SOUL_CONST,
            Constants.RU_HEALTH_CONST,
            Constants.RU_HOURGLASS_CONST,
            Constants.RU_ISLAND_OF_BAD_LUCK_CONST,
            Constants.RU_JOB_CONST,
            Constants.RU_LONDON_FOG_CONST,
            Constants.RU_OTELLO_CONST,
            Constants.RU_TELEPATHY_CONST,
            Constants.RU_TEN_CARDS_CONST,
            Constants.RU_THE_ROAD_OF_WISHES_CONST,
            Constants.RU_TWO_WINGS_CONST,
            Constants.RU_WILL_THIS_CONTINUE_CONST
    };

    public String getQuestions(int questionNumber) {
        String questions = mQuestions[questionNumber];
        return questions;
    }

    public String[] getChoice(int questionNumber) {
        String [] choice = mChoice[questionNumber];
        return choice;
    }

    public String getImages(int questionNumber) {
        String image = mImages[questionNumber];
        return image;
    }

    public String getQuestionType(int questionNumber) {
        String questionType = mQuestionType[questionNumber];
        return questionType;
    }

    public int getLength (){
        return mQuestions.length;
    }

    public String getCorrectAnswer(int questionNumber) {
        String correctAnswer = mCorrectAnswer[questionNumber];
        return correctAnswer;
    }
}

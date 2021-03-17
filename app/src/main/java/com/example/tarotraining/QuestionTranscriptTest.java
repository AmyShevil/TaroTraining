package com.example.tarotraining;

public class QuestionTranscriptTest {

    private String mQuestions[] = {
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST,
            com.example.tarotraining.Constants.WHICH_TRANSCRIPT_IS_DOWN_HERE_CONST
    };

    private String mChoice[] [] = {
            {com.example.tarotraining.Constants.RU_COURT_T_CONST, com.example.tarotraining.Constants.RU_MAG_T_CONST, com.example.tarotraining.Constants.RU_HIGH_PRIESTESS_T_CONST},
            {com.example.tarotraining.Constants.RU_MAG_T_CONST, com.example.tarotraining.Constants.RU_SUN_T_CONST, com.example.tarotraining.Constants.RU_DEATH_T_CONST},
            {com.example.tarotraining.Constants.RU_DEATH_T_CONST, com.example.tarotraining.Constants.RU_DEVIL_T_CONST, com.example.tarotraining.Constants.RU_JUSTICE_T_CONST},
            {com.example.tarotraining.Constants.RU_THE_EMPRESS_T_CONST, com.example.tarotraining.Constants.RU_EMPEROR_T_CONST, com.example.tarotraining.Constants.RU_POWER_T_CONST},
            {com.example.tarotraining.Constants.RU_THE_HERMIT_T_CONST, com.example.tarotraining.Constants.RU_HIEROPHANT_T_CONST, com.example.tarotraining.Constants.RU_HANGED_MAN_T_CONST},
            {com.example.tarotraining.Constants.RU_MAG_T_CONST, com.example.tarotraining.Constants.RU_HIEROPHANT_T_CONST, com.example.tarotraining.Constants.RU_STAR_T_CONST},
            {com.example.tarotraining.Constants.RU_MOON_T_CONST, com.example.tarotraining.Constants.RU_THE_EMPRESS_T_CONST, com.example.tarotraining.Constants.RU_HIGH_PRIESTESS_T_CONST},
            {com.example.tarotraining.Constants.RU_JESTER_T_CONST, com.example.tarotraining.Constants.RU_THE_CHARIOT_T_CONST, com.example.tarotraining.Constants.RU_MODERATION_T_CONST},
            {com.example.tarotraining.Constants.RU_WHEEL_OF_FORTUNE_T_CONST, com.example.tarotraining.Constants.RU_COURT_T_CONST, com.example.tarotraining.Constants.RU_JUSTICE_T_CONST},
            {com.example.tarotraining.Constants.RU_LOVERS_T_CONST, com.example.tarotraining.Constants.RU_PEACE_T_CONST, com.example.tarotraining.Constants.RU_HIGH_PRIESTESS_T_CONST},
            {com.example.tarotraining.Constants.RU_MAG_T_CONST, com.example.tarotraining.Constants.RU_THE_HERMIT_T_CONST, com.example.tarotraining.Constants.RU_WHEEL_OF_FORTUNE_T_CONST},
            {com.example.tarotraining.Constants.RU_MODERATION_T_CONST, com.example.tarotraining.Constants.RU_TOWER_T_CONST, com.example.tarotraining.Constants.RU_HIEROPHANT_T_CONST},
            {com.example.tarotraining.Constants.RU_STAR_T_CONST, com.example.tarotraining.Constants.RU_MOON_T_CONST, com.example.tarotraining.Constants.RU_SUN_T_CONST},
            {com.example.tarotraining.Constants.RU_JUSTICE_T_CONST, com.example.tarotraining.Constants.RU_POWER_T_CONST, com.example.tarotraining.Constants.RU_PEACE_T_CONST},
            {com.example.tarotraining.Constants.RU_THE_CHARIOT_T_CONST, com.example.tarotraining.Constants.RU_POWER_T_CONST, com.example.tarotraining.Constants.RU_COURT_T_CONST},
            {com.example.tarotraining.Constants.RU_STAR_T_CONST, com.example.tarotraining.Constants.RU_MOON_T_CONST, com.example.tarotraining.Constants.RU_SUN_T_CONST},
            {com.example.tarotraining.Constants.RU_STAR_T_CONST, com.example.tarotraining.Constants.RU_MOON_T_CONST, com.example.tarotraining.Constants.RU_SUN_T_CONST},
            {com.example.tarotraining.Constants.RU_THE_CHARIOT_T_CONST, com.example.tarotraining.Constants.RU_PEACE_T_CONST, com.example.tarotraining.Constants.RU_EMPEROR_T_CONST},
            {com.example.tarotraining.Constants.RU_HIGH_PRIESTESS_T_CONST, com.example.tarotraining.Constants.RU_EMPEROR_T_CONST, com.example.tarotraining.Constants.RU_THE_EMPRESS_T_CONST},
            {com.example.tarotraining.Constants.RU_THE_HERMIT_T_CONST, com.example.tarotraining.Constants.RU_HIEROPHANT_T_CONST, com.example.tarotraining.Constants.RU_MAG_T_CONST},
            {com.example.tarotraining.Constants.RU_TOWER_T_CONST, com.example.tarotraining.Constants.RU_COURT_T_CONST, com.example.tarotraining.Constants.RU_DEATH_T_CONST},
            {com.example.tarotraining.Constants.RU_JUSTICE_T_CONST, com.example.tarotraining.Constants.RU_COURT_T_CONST, com.example.tarotraining.Constants.RU_WHEEL_OF_FORTUNE_T_CONST}

    };

    private String mImages[] ={
            com.example.tarotraining.Constants.COURT_CONST,  //Суд
            com.example.tarotraining.Constants.DEATH_CONST, //Смерть
            com.example.tarotraining.Constants.DEVIL_CONST, //Дьявол
            com.example.tarotraining.Constants.EMPEROR_CONST, //Император
            com.example.tarotraining.Constants.HANGED_MAN_CONST, //Повешенный
            com.example.tarotraining.Constants.HIEROPHANT_CONST,  //Иерофант
            com.example.tarotraining.Constants.HIGH_PRIESTESS_CONST, //Верховная жрица
            com.example.tarotraining.Constants.JESTER_CONST, //Шут
            com.example.tarotraining.Constants.JUSTICE_CONST, //Правосудие
            com.example.tarotraining.Constants.LOVERS_CONST, //Влюбленные
            com.example.tarotraining.Constants.MAG_CONST, //Маг
            com.example.tarotraining.Constants.MODERATION_CONST, //Умеренность
            com.example.tarotraining.Constants.MOON_CONST, //Луна
            com.example.tarotraining.Constants.PEACE_CONST, //Мир
            com.example.tarotraining.Constants.POWER_CONST, //Сила
            com.example.tarotraining.Constants.STAR_CONST, //Звезда
            com.example.tarotraining.Constants.SUN_CONST,  //Солнце
            com.example.tarotraining.Constants.THE_CHARIOT_CONST, //Колесница
            com.example.tarotraining.Constants.THE_EMPRESS_CONST, //Императрица
            com.example.tarotraining.Constants.THE_HERMIT_CONST, //Отшельник
            com.example.tarotraining.Constants.TOWER_CONST, //Башня
            com.example.tarotraining.Constants.WHEEL_OF_FORTUNE_CONST  //Колесо фортуны
    };

    private String mQuestionType[] = {
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST,
            com.example.tarotraining.Constants.RADIO_BUTTON_CONST
    };

    private String mCorrectAnswer [] = {
            com.example.tarotraining.Constants.RU_COURT_T_CONST,
            com.example.tarotraining.Constants.RU_DEATH_T_CONST,
            com.example.tarotraining.Constants.RU_DEVIL_T_CONST,
            com.example.tarotraining.Constants.RU_EMPEROR_T_CONST,
            com.example.tarotraining.Constants.RU_HANGED_MAN_T_CONST,
            com.example.tarotraining.Constants.RU_HIEROPHANT_T_CONST,
            com.example.tarotraining.Constants.RU_HIGH_PRIESTESS_T_CONST,
            com.example.tarotraining.Constants.RU_JESTER_T_CONST,
            com.example.tarotraining.Constants.RU_JUSTICE_T_CONST,
            com.example.tarotraining.Constants.RU_LOVERS_T_CONST,
            com.example.tarotraining.Constants.RU_MAG_T_CONST,
            com.example.tarotraining.Constants.RU_MODERATION_T_CONST,
            com.example.tarotraining.Constants.RU_MOON_T_CONST,
            com.example.tarotraining.Constants.RU_PEACE_T_CONST,
            com.example.tarotraining.Constants.RU_POWER_T_CONST,
            com.example.tarotraining.Constants.RU_STAR_T_CONST,
            com.example.tarotraining.Constants.RU_SUN_T_CONST,
            com.example.tarotraining.Constants.RU_THE_CHARIOT_T_CONST,
            com.example.tarotraining.Constants.RU_THE_EMPRESS_T_CONST,
            com.example.tarotraining.Constants.RU_THE_HERMIT_T_CONST,
            com.example.tarotraining.Constants.RU_TOWER_T_CONST,
            com.example.tarotraining.Constants.RU_WHEEL_OF_FORTUNE_T_CONST
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

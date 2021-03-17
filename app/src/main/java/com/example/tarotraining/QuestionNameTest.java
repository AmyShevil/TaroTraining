package com.example.tarotraining;

public class QuestionNameTest {

    private String mQuestions[] = {
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST,
            Constants.RU_NAME_TEST_QUESTION_CONST
    };

    private String mChoice[] [] = {
            {Constants.RU_COURT_CONST, Constants.RU_MAG_CONST, Constants.RU_HIGH_PRIESTESS_CONST},
            {Constants.RU_MAG_CONST, Constants.RU_SUN_CONST, Constants.RU_DEATH_CONST},
            {Constants.RU_DEATH_CONST, Constants.RU_DEVIL_CONST, Constants.RU_JUSTICE_CONST},
            {Constants.RU_THE_EMPRESS_CONST, Constants.RU_EMPEROR_CONST, Constants.RU_POWER_CONST},
            {Constants.RU_THE_HERMIT_CONST, Constants.RU_HIEROPHANT_CONST, Constants.RU_HANGED_MAN_CONST},
            {Constants.RU_MAG_CONST, Constants.RU_HIEROPHANT_CONST, Constants.RU_STAR_CONST},
            {Constants.RU_MOON_CONST, Constants.RU_THE_EMPRESS_CONST, Constants.RU_HIGH_PRIESTESS_CONST},
            {Constants.RU_JESTER_CONST, Constants.RU_THE_CHARIOT_CONST, Constants.RU_MODERATION_CONST},
            {Constants.RU_WHEEL_OF_FORTUNE_CONST, Constants.RU_COURT_CONST, Constants.RU_JUSTICE_CONST},
            {Constants.RU_LOVERS_CONST, Constants.RU_PEACE_CONST, Constants.RU_HIGH_PRIESTESS_CONST},
            {Constants.RU_MAG_CONST, Constants.RU_THE_HERMIT_CONST, Constants.RU_WHEEL_OF_FORTUNE_CONST},
            {Constants.RU_MODERATION_CONST, Constants.RU_TOWER_CONST, Constants.RU_HIEROPHANT_CONST},
            {Constants.RU_STAR_CONST, Constants.RU_MOON_CONST, Constants.RU_SUN_CONST},
            {Constants.RU_JUSTICE_CONST, Constants.RU_POWER_CONST, Constants.RU_PEACE_CONST},
    	    {Constants.RU_THE_CHARIOT_CONST, Constants.RU_POWER_CONST, Constants.RU_COURT_CONST},
      	    {Constants.RU_STAR_CONST, Constants.RU_MOON_CONST, Constants.RU_SUN_CONST},
            {Constants.RU_STAR_CONST, Constants.RU_MOON_CONST, Constants.RU_SUN_CONST},
	        {Constants.RU_THE_CHARIOT_CONST, Constants.RU_PEACE_CONST, Constants.RU_EMPEROR_CONST},
            {Constants.RU_HIGH_PRIESTESS_CONST, Constants.RU_EMPEROR_CONST, Constants.RU_THE_EMPRESS_CONST},
            {Constants.RU_THE_HERMIT_CONST, Constants.RU_HIEROPHANT_CONST, Constants.RU_MAG_CONST},
            {Constants.RU_TOWER_CONST, Constants.RU_COURT_CONST, Constants.RU_DEATH_CONST},
            {Constants.RU_JUSTICE_CONST, Constants.RU_COURT_CONST, Constants.RU_WHEEL_OF_FORTUNE_CONST}
    
};

    private String mImages[] ={
            Constants.COURT_CONST,  //Суд
            Constants.DEATH_CONST, //Смерть
            Constants.DEVIL_CONST, //Дьявол
            Constants.EMPEROR_CONST, //Император
            Constants.HANGED_MAN_CONST, //Повешенный
            Constants.HIEROPHANT_CONST,  //Иерофант
            Constants.HIGH_PRIESTESS_CONST, //Верховная жрица
            Constants.JESTER_CONST, //Шут
            Constants.JUSTICE_CONST, //Правосудие
            Constants.LOVERS_CONST, //Влюбленные
            Constants.MAG_CONST, //Маг
            Constants.MODERATION_CONST, //Умеренность
            Constants.MOON_CONST, //Луна
            Constants.PEACE_CONST, //Мир
            Constants.POWER_CONST, //Сила
            Constants.STAR_CONST, //Звезда
            Constants.SUN_CONST,  //Солнце
            Constants.THE_CHARIOT_CONST, //Колесница
            Constants.THE_EMPRESS_CONST, //Императрица
            Constants.THE_HERMIT_CONST, //Отшельник
            Constants.TOWER_CONST, //Башня
            Constants.WHEEL_OF_FORTUNE_CONST  //Колесо фортуны
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
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST,
            Constants.RADIO_BUTTON_CONST
    };

    private String mCorrectAnswer [] = {
            Constants.RU_COURT_CONST,
            Constants.RU_DEATH_CONST,
            Constants.RU_DEVIL_CONST,
            Constants.RU_EMPEROR_CONST,
            Constants.RU_HANGED_MAN_CONST,
            Constants.RU_HIEROPHANT_CONST,
            Constants.RU_HIGH_PRIESTESS_CONST,
            Constants.RU_JESTER_CONST,
            Constants.RU_JUSTICE_CONST,
            Constants.RU_LOVERS_CONST,
            Constants.RU_MAG_CONST,
            Constants.RU_MODERATION_CONST,
            Constants.RU_MOON_CONST,
            Constants.RU_PEACE_CONST,
            Constants.RU_POWER_CONST,
            Constants.RU_STAR_CONST,
	        Constants.RU_SUN_CONST,
            Constants.RU_THE_CHARIOT_CONST,
            Constants.RU_THE_EMPRESS_CONST,
            Constants.RU_THE_HERMIT_CONST,
            Constants.RU_TOWER_CONST,
            Constants.RU_WHEEL_OF_FORTUNE_CONST
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

package AutomationProject.MainFolder;

public class Config {

    public static class Credentials {
        public static class Valid {
            public static String Username = "user@phptravels.com";
            public static String Password = "demouser";

        }

        public static class Invalid {
            public static class UserName {
                public static String FourCharacters = "Asdf";
                public static String ThirteenCharacters = "AsdfAsdfAsdfG";
            }

            public static class Password {
                public static String SpecialSigns = "!@#$%";
                public static String UpperLetters = "ASDF";
                public static String LowerLetters = "asdf";
            }

        }
    }
}
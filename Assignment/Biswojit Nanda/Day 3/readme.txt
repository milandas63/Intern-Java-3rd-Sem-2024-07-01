  String[][] users = { {"Milan","das"},
                             {"Prateekshya","patnaik"},
                             {"Goutam","gosain"},
                             {"Chinmay","maharana"},
                             {"Satyam","behera"},
                             {"Purna","panda"},
                             {"Soumya","mishra"} };

        Create Exception classes in the following hierarchy>
            java.lang.Object
            +- java.lang.Throwable
            |  +- java.lang.Exception
            |  |  +- com.password.LoginException
            |  |  |  +- com.password.WrongUsernameException
            |  |  |  +- com.password.WrongPasswordException
            |  |  +- java.lang.RuntimeException
            |  |  |  +- com.password.InvalidLoginException
            |  |  |  |  +- com.password.InvalidSpecialCharacterException
            |  |  |  |  +- com.password.TooSmallUsernameException
            |  |  |  |  +- com.password.TooLongUsernameException
            |  |  |  |  +- com.password.WrongStartCharacterException
            |  |  |  |  +- com.password.SpaceInUsernameException

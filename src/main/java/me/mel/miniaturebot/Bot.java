package me.mel.miniaturebot;

import net.dv8tion.jda.api.JDABuilder;

import javax.security.auth.login.LoginException;

public class Bot {

    private Bot() throws LoginException {
        JDABuilder
                .createDefault(Config.get("TOKEN"))
                .addEventListeners(new Listener())
                .build();
    }

    public static void main(String[] args) throws LoginException {
        new Bot();
    }
}

package org.example;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.Permission;
import net.dv8tion.jda.api.entities.channel.ChannelType;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.DefaultMemberPermissions;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.GatewayIntent;

public class Main extends ListenerAdapter
{
    public static void main(String[] args)
    {
        JDA jda = JDABuilder.createDefault("MTIwNjkyNzc5NTcxMjgyNzQxMg.GzMpiU.1fsqtfWXXNUlUZ29QI50cvw3X-uSvK-EIn3rjk")
                .enableIntents(GatewayIntent.MESSAGE_CONTENT) // enables explicit access to message.getContentDisplay()
                .build();
        jda.addEventListener(new Main());
    }


    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {

        var split = event.getMessage().getContentDisplay().split(" ");
        String command = split[0];
        switch (command){
            case "/conan_help":
                event.getMessage().reply("help").complete();
                break;

            case "/conan_map":
                event.getMessage().reply("Voci la map \n https://www.gamerguides.com/conan-exiles/maps/conan-exiles-map-the-exiled-lands").complete();
                break;

            case "/conan_item":


        }
    }
}
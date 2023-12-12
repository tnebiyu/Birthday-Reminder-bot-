package com.neba.Lidet;

import com.neba.Lidet.repository.BirthDayRepository;
import com.neba.Lidet.service.Bot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
@ComponentScan(basePackages = "com.neba.Lidet.service")
@EnableScheduling
public class LidetApplication {


	public static void main(String[] args) {

		try {
			ApplicationContext context = SpringApplication.run(LidetApplication.class, args);
//			BirthDayRepository birthDayRepository = context.getBean(BirthDayRepository.class);
//			Bot bot = context.getBean(Bot.class);



Bot bot1 = new Bot();




			TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
			telegramBotsApi.registerBot(bot1);

			System.out.println("Bot started successfully");
		} catch (TelegramApiException e) {
			e.printStackTrace();
		}
	}
}

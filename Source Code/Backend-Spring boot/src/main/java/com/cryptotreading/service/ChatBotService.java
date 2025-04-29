package com.cryptotreading.service;

import com.cryptotreading.model.CoinDTO;
import com.cryptotreading.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}

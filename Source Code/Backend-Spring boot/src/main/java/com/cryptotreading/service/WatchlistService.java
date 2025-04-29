package com.cryptotreading.service;

import com.cryptotreading.model.Coin;
import com.cryptotreading.model.User;
import com.cryptotreading.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}

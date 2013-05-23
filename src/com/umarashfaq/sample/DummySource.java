package com.umarashfaq.sample;

import java.util.ArrayList;
import java.util.List;

/**
 * A very primitive implementation of Source which returns a list of
 * dummy news items
 * @author Umar
 *
 */
public class DummySource implements Source {

	@Override
	public List<Item> fetch() {
		List<Item> items = new ArrayList<>();
		
		items.add(new Item("Google launches streaming music service ahead of Apple", "SAN FRANCISCO (Reuters) - Google Inc launched a music service on Wednesday that allows users to listen to unlimited songs for $9.99 a month, challenging smaller companies like Pandora and Spotify in the market for streaming music."));
		items.add(new Item("JANA Partners reveals stakes in Zynga, Groupon", "BOSTON (Reuters) - JANA Partners, a leading activist hedge fund firm run by Barry Rosenstein, has taken a liking to two of the most beaten-up technology stocks."));
		items.add(new Item("Cisco quarterly profit beats Street, shares rise", "NEW YORK (Reuters) - Cisco Systems Inc posted a higher than expected quarterly profit, suggesting that the network equipment maker's customers are spending more on technology."));
		items.add(new Item("New Trick to Get the Best Seat in Coach", "Flying first class is fun. Flying in the middle seat of row 42 generally isn’t. But a few tricks and low cost gadgets can transform that coach seat into a much more pleasant experience."));
		items.add(new Item("Hedge funds shop at Supervalu, sour on Apple", "NEW YORK (Reuters) - Barry Rosenstein's JANA Partners liked grocery chain Supervalu Inc in a big way in the first quarter, while Philippe Laffont's Coatue Management lost its stomach for the company's shares."));
		
		return items;
	}

}

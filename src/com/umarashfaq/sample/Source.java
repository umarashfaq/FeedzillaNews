package com.umarashfaq.sample;

import java.util.List;

/**
 * A Source has to return a list of Items.
 * @author Umar
 *
 */
public interface Source {
	List<Item> fetch();
}

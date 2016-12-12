package net.mohron.skyclaims;

import com.google.common.collect.Maps;

import java.util.Map;
import java.util.UUID;

public class DataStore {
	protected static Map<UUID, Island> data = Maps.newHashMap();

	public Island createIsland(UUID owner) {
		int x, z;

		//TODO

		return new Island(owner);
	}

	public void updateIsland(Island island){
		data.put(island.getOwner(), island);
	}

	public Island getIsland(UUID owner) {
		if (!data.containsKey(owner)) updateIsland(createIsland(owner));
		return data.get(owner);
	}

	public boolean hasIsland(UUID owner) {
		return data.containsKey(owner);
	}
}
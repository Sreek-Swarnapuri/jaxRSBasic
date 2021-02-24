package com.golden.jaxRSBasic.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.golden.jaxRSBasic.database.DatabaseClass;
import com.golden.jaxRSBasic.model.Profile;

public class ProfileService {

	private Map<String, Profile> profiles = DatabaseClass.getProfiles();

	public ProfileService() {
		profiles.put("Sreek", new Profile(1L,"Sreek","Sreekar","Swarnapuri",new Date()));
		profiles.put("Pandu", new Profile(2L,"Pandu","Vandana","Swarnapuri",new Date()));
	}

	public List<Profile> getAllProfiles() {
		return new ArrayList<Profile>(profiles.values());
	}

	public Profile getProfile(String profileName) {
		return profiles.get(profileName);
	}

	public Profile addMessage(Profile profile) {
		profile.setId(profiles.size() + 1);
		profiles.put(profile.getProfileName(), profile);
		return profile;
	}

	public Profile updateMessage(Profile profile) {
		if (profile.getId() <= 0)
			return null;
		profiles.put(profile.getProfileName(), profile);
		return profiles.get(profile.getProfileName());
	}

	public Profile removeMessage(String profileName) {
		return profiles.remove(profileName);
	}

}

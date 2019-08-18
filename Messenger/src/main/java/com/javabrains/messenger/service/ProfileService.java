package com.javabrains.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.javabrains.messenger.database.DatabaseClass;
import com.javabrains.messenger.model.Profile;

public class ProfileService {

	private static Map<String, Profile> profilesMap= DatabaseClass.getProfiles();
	
	public ProfileService() {
		profilesMap.put("Sagar", new Profile(1,"Sagar"," Sagar rao","Annamaneni"));
		
	}
	
	public List<Profile> getAllProfiles() {			
		System.out.println(profilesMap.values());
		return new ArrayList<Profile>(profilesMap.values());
	}
	
	public Profile getProfile(String pName) {			
		return profilesMap.get(pName);
	}
	
	public Profile addProfile(Profile profile) {
		System.out.println(profilesMap.values());
		profile.setId(profilesMap.size()+1);
		profilesMap.put(profile.getProfileName(), profile);
		return profile;		
	}

	public Profile updateProfile(Profile prof) {
		if (prof.getProfileName().length() <=0) {
			return null;
		} else {
			profilesMap.put(prof.getProfileName(), prof);
			return prof;
		}
	}
	
	public Profile removeProfile(String pName) {
		return profilesMap.remove(pName);
		
	}
}

package com.javabrains.messenger.resource;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.javabrains.messenger.model.Profile;
import com.javabrains.messenger.service.ProfileService;

@Path("/profiles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ProfileResource {

	ProfileService profService = new ProfileService();

	@GET
	public List<Profile> getProfiles() {
		return profService.getAllProfiles();
	}

	@GET
	@Path("/{Profile_name}")
	public Profile getProfile(@PathParam("Profile_name") String profName) {
		return profService.getProfile(profName);
	}

	@POST
	public Profile addProfile(Profile prof) {
		return profService.addProfile(prof);
	}

	@PUT
	@Path("/{Profile_name}")
	public Profile updateProfile(@PathParam("Profile_name") String profName, Profile prof) {
		prof.setProfileName(profName);
		return profService.updateProfile(prof);
	}

	@DELETE
	@Path("/{Profile_name}")
	public void deleteProfile(@PathParam("Profile_name") String profName) {
		profService.removeProfile(profName);
	}

}

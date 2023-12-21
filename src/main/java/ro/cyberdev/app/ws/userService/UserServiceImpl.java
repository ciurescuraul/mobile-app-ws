package ro.cyberdev.app.ws.userService;

import org.springframework.stereotype.Service;
import ro.cyberdev.app.ws.shared.Utils;
import ro.cyberdev.app.ws.ui.model.request.UpdateUserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.request.UserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.response.UserRest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    private final Utils utils;

    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {

        UserRest returnValue = new UserRest();
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());

        // Generate a random UUID
        String userId = utils.generateUserId();
        returnValue.setUserId(userId);

        if (users == null) users = new HashMap<>();
        users.put(userId, returnValue);

        return returnValue;
    }

    @Override
    public UserRest getUser(String userId) {
        return users.getOrDefault(userId, null);
    }

    @Override
    public Collection<UserRest> getAllUsers() {
        return users.values();
    }

    @Override
    public UserRest updateUser(String userId, UpdateUserDetailsRequestModel userDetails) {
        // Get the user from the HashMap
        UserRest storedUserDetails = users.get(userId);

        // Update existing user details
        storedUserDetails.setFirstName(userDetails.getFirstName());
        storedUserDetails.setLastName(userDetails.getLastName());

        return storedUserDetails;
    }

    @Override
    public void deleteUser(String id) {
        this.users.remove(id);
    }
}

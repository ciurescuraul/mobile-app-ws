package ro.cyberdev.app.ws.userService;

import org.springframework.stereotype.Service;
import ro.cyberdev.app.ws.ui.model.request.UserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.response.UserRest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        // Generate a random UUID
        String userId = String.valueOf(UUID.randomUUID());

        UserRest returnValue = new UserRest();
        returnValue.setFirstName(userDetails.getFirstName());
        returnValue.setLastName(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());
        returnValue.setUserId(userId);

        // Store the user in a HashMap
        if (users == null) users = new HashMap<>();
        users.put(userId, returnValue);

        return returnValue;
    }
}

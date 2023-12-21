package ro.cyberdev.app.ws.userService;

import org.springframework.stereotype.Service;
import ro.cyberdev.app.ws.shared.Utils;
import ro.cyberdev.app.ws.ui.model.request.UserDetailsRequestModel;
import ro.cyberdev.app.ws.ui.model.response.UserRest;

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

        // Store the user in a HashMap
        if (users == null) users = new HashMap<>();
        users.put(userId, returnValue);

        return returnValue;
    }
}

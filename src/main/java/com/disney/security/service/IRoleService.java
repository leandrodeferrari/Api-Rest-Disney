package com.disney.security.service;

import com.disney.security.model.Role;

public interface IRoleService {

    Role findByName(String name);

}

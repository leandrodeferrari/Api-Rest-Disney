package com.disney.security.mapper;

import com.disney.security.dto.UserDto;
import com.disney.security.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IUserMapper {

    @Mappings({
            @Mapping(target = "creationDate", dateFormat = "dd.MM.yyyy"),
            @Mapping(target = "updateDate", dateFormat = "dd.MM.yyyy")
    })
    UserDto userToUserDto(User user);

}

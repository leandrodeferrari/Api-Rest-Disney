package com.disney.security.mapper;

import com.disney.security.dto.RegisterInDto;
import com.disney.security.dto.RegisterOutDto;
import com.disney.security.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IAuthMapper {

    RegisterInDto userToRegisterInDto(User user);
    User registerInDtoToUser(RegisterInDto registerInDto);

    @Mappings({
            @Mapping(target = "creationDate", dateFormat = "dd.MM.yyyy"),
            @Mapping(target = "token", ignore = true)
    })
    RegisterOutDto userToRegisterOutDto(User user);
    User registerOutDtoToUser(RegisterOutDto registerOutDto);

}

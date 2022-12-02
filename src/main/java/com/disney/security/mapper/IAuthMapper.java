package com.disney.security.mapper;

import com.disney.security.dto.RegisterInDto;
import com.disney.security.dto.RegisterOutDto;
import com.disney.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IAuthMapper {

    RegisterInDto userToRegisterInDto(User user);
    User registerInDtoToUser(RegisterInDto registerInDto);

    @Mapping(target = "creationDate", dateFormat = "dd.MM.yyyy")
    RegisterOutDto userToRegisterOutDto(User user);
    User registerOutDtoToUser(RegisterOutDto registerOutDto);

}

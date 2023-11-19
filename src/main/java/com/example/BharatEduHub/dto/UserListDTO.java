package com.example.BharatEduHub.dto;

import lombok.Data;

import java.util.List;

@Data
public class UserListDTO {
    public UserListDTO(List<UserDTO> userDTOList) {
        this.userDTOList = userDTOList;
    }

    private List<UserDTO> userDTOList;
}

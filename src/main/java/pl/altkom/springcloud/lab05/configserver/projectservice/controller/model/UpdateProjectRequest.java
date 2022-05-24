package pl.altkom.springcloud.lab05.configserver.projectservice.controller.model;

import javax.validation.constraints.NotNull;

import lombok.Getter;

@Getter
public class UpdateProjectRequest {

    @NotNull
    private String name;
}

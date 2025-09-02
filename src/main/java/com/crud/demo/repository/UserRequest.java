package com.crud.demo.repository;

import java.util.UUID;

public record UserRequest(UUID id, String name, String email) {}

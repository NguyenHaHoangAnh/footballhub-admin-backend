package com.example.footballhub_admin_backend.service;

import com.example.core.message.ResponseMsg;
import com.example.footballhub_admin_backend.model.Area;

public interface AreaService {
    ResponseMsg<?> updateAreaManually() throws Exception;

    ResponseMsg<?> findParentAreas() throws Exception;

    ResponseMsg<?> createArea(Area newArea) throws Exception;

    ResponseMsg<?> updateArea(Integer areaId, Area newArea) throws Exception;
}

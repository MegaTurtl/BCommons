/*
 * Copyright 2019 Bradley Steele
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.bradleysteele.commons.gson.adapter;

import com.google.gson.*;
import me.bradleysteele.commons.gson.GsonAdapter;

import java.lang.reflect.Type;
import java.util.UUID;

/**
 * @author Bradley Steele
 */
public class UUIDAdapter implements GsonAdapter<UUID> {

    @Override
    public JsonElement serialize(UUID uuid, Type type, JsonSerializationContext context) {
        return new JsonPrimitive(uuid.toString());
    }

    @Override
    public UUID deserialize(JsonElement element, Type type, JsonDeserializationContext context) throws JsonParseException {
        return UUID.fromString(element.getAsString());
    }
}
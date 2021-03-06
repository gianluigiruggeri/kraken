/*
 * Copyright 2013 Marco Salis - fast3r(at)gmail.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.marcosalis.kraken.cache;

import com.google.common.annotations.Beta;

/**
 * Public interface for a second level cache, usually disk or network based.<br>
 * It holds no methods for now.
 * 
 * @since 1.0
 * @author Marco Salis
 */
@Beta
public interface SecondLevelCache<K, V> extends ContentCache<K, V> {

}
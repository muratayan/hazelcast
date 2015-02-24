/*
 * Copyright (c) 2008-2015, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * <p>This package contains Lock for Hazelcast.<br/>
 *
 * The {@link com.hazelcast.core.ILock} is the distributed version of the {@link java.util.concurrent.locks.Lock}.
 * So a lock can be acquired by different JVM's in the same cluster. When a JVM dies which acquired the Lock, the lock
 * is automatically released to prevent deadlocks. When a JVM dies which owns the partitions of that lock, the backup
 * partition will make sure that the lock is restored and therefor the lock is also highly available.
 *
 * @since 1
 */
package com.hazelcast.concurrent.lock;

/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.fs.azurebfs.services;

/**
 * The REST operation type (Read, Append, Other ).
 */
public enum AbfsRestOperationType {
    CreateFileSystem,
    GetFileSystemProperties,
    SetFileSystemProperties,
    ListPaths,
    DeleteFileSystem,
    CreatePath,
    RenamePath,
    GetAcl,
    GetPathProperties,
    GetPathStatus,
    SetAcl,
    SetOwner,
    SetPathProperties,
    SetPermissions,
    Append,
    Flush,
    ReadFile,
    DeletePath,
    CheckAccess,
    LeasePath,
    CreateContainer,
    GetContainerProperties,
    SetContainerMetadata,
    DeleteContainer,
    ListBlobs,
    PutBlob,
    PutBlock,
    PutBlockList,
    LeaseBlob,
    GetBlob,
    GetBlockList,
    GetBlobProperties,
    SetBlobMetadata,
    DeleteBlob,
    CopyBlob
}

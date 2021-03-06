/*
 * Copyright 2011-2012 Alfresco Software Limited.
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
 *
 * This file is part of an unsupported extension to Alfresco.
 */

package org.alfresco.repo.jive;

import org.alfresco.service.cmr.repository.NodeRef;

public class CannotDeleteSocializedDocumentException
    extends JiveServiceException
{
    private static final long serialVersionUID = -4086575872915036967L;

    public CannotDeleteSocializedDocumentException(final NodeRef nodeRef)
    {
        super("NodeRef " + String.valueOf(nodeRef) + " cannot be deleted as it is socialized to Jive.");
    }
    
}
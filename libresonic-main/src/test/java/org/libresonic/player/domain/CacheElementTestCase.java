/*
 This file is part of Libresonic.

 Libresonic is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 Libresonic is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with Libresonic.  If not, see <http://www.gnu.org/licenses/>.

 Copyright 2016 (C) Libresonic Authors
 Based upon Subsonic, Copyright 2009 (C) Sindre Mehus
 */
package org.libresonic.player.domain;

import junit.framework.TestCase;

/**
 * Unit test of {@link org.libresonic.player.domain.CacheElement}.
 *
 * @author Sindre Mehus
 */
public class CacheElementTestCase extends TestCase {

    public void testCreateId() {

        assertTrue(CacheElement.createId(1, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home") ==
                CacheElement.createId(1, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home"));

        assertTrue(CacheElement.createId(1, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home") !=
                CacheElement.createId(2, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home"));

        assertTrue(CacheElement.createId(237462763, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home") !=
                CacheElement.createId(28374922, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home"));

        assertTrue(CacheElement.createId(1, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home bla bla") !=
                CacheElement.createId(1, "/Volumes/WD Passport/music/'Til Tuesday/Welcome Home"));
    }
}
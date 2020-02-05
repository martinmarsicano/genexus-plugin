/*
 * The MIT License
 *
 * Copyright 2020 GeneXus S.A..
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.genexus.server.info;

import java.util.UUID;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

/**
 *
 * @author jlr
 */
@XmlAccessorType(XmlAccessType.NONE)
public class VersionInfo {

    @XmlAttribute(name = "id")
    public int id;

    @XmlAttribute(name = "name")
    public String name;

    @XmlAttribute(name = "guid")
    public UUID guid;

    @XmlAttribute(name = "type")
    public UUID type;

    @XmlAttribute(name = "isTrunk")
    public Boolean isTrunk;

    @XmlAttribute(name = "parentId")
    public int parentId;

    @XmlAttribute(name = "isFrozen")
    public Boolean isFrozen;

    @XmlAttribute(name = "remindsCount")
    public int remindsCount;
}
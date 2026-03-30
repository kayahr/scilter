scilter
=======

Description
-----------

Scilter (A shorter name for Scale Filter) is a library which can be used
to scale images with different algorithms.

The following algorithms are currently supported:

* [HQX magnification filter][3] (2x, 3x and 4x) from Maxim Stepin.
* Nearest Neighbor (2x, 3x and 4x)
* scale2x and scale3x algorithms from Kevin Glass.

Scilter can also be used as a command line tool for scaling images.


License
-------

This library is free software: you can redistribute it and/or modify it
under the terms of the GNU Lesser General Public License as published by the
Free Software Foundation, either version 3 of the License, or (at your
option) any later version.

This library is distributed in the hope that it will be useful, but WITHOUT
ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the
[GNU Lesser General Public License][2] for more details.


Download
--------

The JAR can be downloaded from the [Github Maven Repository][1] or if you are
using Maven you can simply add it as a dependency:

    <repositories>
      <repository>
        <id>github-scilter</id>
        <url>https://maven.pkg.github.com/kayahr/scilter</url>
      </repository>
    </repositories>

    <dependencies>
      <dependency>
        <groupId>de.ailis.scilter</groupId>
        <artifactId>scilter</artifactId>
        <version>1.0.2</version>
      </dependency>
    </dependencies>

[1]: https://github.com/kayahr/scilter/packages/ "Github Maven Repository"
[2]: http://www.gnu.org/licenses/lgpl.html "License"
[3]: http://en.wikipedia.org/wiki/Hqx "HQX magnification filter"

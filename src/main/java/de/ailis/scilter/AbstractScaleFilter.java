/*
 * $Id$
 * Copyright (C) 2006 Klaus Reimer <k@ailis.de>
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */

package de.ailis.scilter;

import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.IndexColorModel;


/**
 * A base class for the scale filters implementing some common functionality.
 *
 * @author Klaus Reimer (k@ailis.de)
 * @version $Revision$
 */

public abstract class AbstractScaleFilter implements ScaleFilter
{
    /**
     * @see ScaleFilter#scale(java.awt.image.BufferedImage)
     */

    @Override
    public BufferedImage scale(final BufferedImage image)
    {
        int[] pixels;
        int width, height;
        int scaleFactor;
        int newWidth, newHeight;
        BufferedImage out;

        // Get the original width
        width = image.getWidth();
        height = image.getHeight();

        // Scale the pixels
        pixels = scale(image.getRGB(0, 0, width, height, null, 0, width),
            width, height);

        // Determine new picture size
        scaleFactor = getScaleFactor();
        newWidth = width * scaleFactor;
        newHeight = height * scaleFactor;

        // Create and return the new picture
        int outType = getImageType();
        if (outType == -1)
        {
            outType = image.getType();
            final ColorModel colorModel = image.getColorModel();
            if (colorModel instanceof IndexColorModel)
                out = new BufferedImage(newWidth, newHeight, outType,
                    (IndexColorModel) colorModel);
            else
                out = new BufferedImage(newWidth, newHeight, outType);
        }
        else
        {
            out = new BufferedImage(newWidth, newHeight, outType);
        }
        out.setRGB(0, 0, newWidth, newHeight, pixels, 0, newWidth);
        return out;
    }
}

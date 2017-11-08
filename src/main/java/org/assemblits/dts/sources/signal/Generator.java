/******************************************************************************
 * Copyright (c) 2017 Assemblits contributors                                 *
 *                                                                            *
 * This file is part of Eru The open JavaFX SCADA by Assemblits Organization. *
 *                                                                            *
 * Eru The open JavaFX SCADA is free software: you can redistribute it        *
 * and/or modify it under the terms of the GNU General Public License         *
 *  as published by the Free Software Foundation, either version 3            *
 *  of the License, or (at your option) any later version.                    *
 *                                                                            *
 * Eru is distributed in the hope that it will be useful,                     *
 * but WITHOUT ANY WARRANTY; without even the implied warranty of             *
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the              *
 * GNU General Public License for more details.                               *
 *                                                                            *
 * You should have received a copy of the GNU General Public License          *
 * along with Foobar.  If not, see <http://www.gnu.org/licenses/>.            *
 ******************************************************************************/
package org.assemblits.dts.sources.signal;

import org.assemblits.dts.sources.signal.wave.Wave;

/**
 * The Signal Generator block can produce one of four different waveforms: sine wave, square wave, sawtooth wave,
 * and random wave. You can express signal parameters in Hertz (the default) or radians per second.
 */
public class Generator {

    private Wave wave;

    private Double output;

    public Generator(Wave wave) {
        this.wave = wave;
    }

    public Wave getWave() {
        return wave;
    }

    public void setWave(Wave wave) {
        this.wave = wave;
    }

    public Double getOutput() {
        return output;
    }
}

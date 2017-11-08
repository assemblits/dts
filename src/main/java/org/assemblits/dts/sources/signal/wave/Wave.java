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
package org.assemblits.dts.sources.signal.wave;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Wave {
    /**
     *Amplitude of signal.
     */
    private Double amplitude = 1.0;

    /**
     *  Waveform frequency in rad/s.
     */
    private Double frequency = 1.0;

    /**
     * Phase offset, in rads.
     */
    private Double phaseOffset = 0.0;

    /**
     * Horizontal signal shift based on elapsed simulation time, in seconds.
     */
    private Double phaseDelay = 0.0;

    /**
     * Percentage of high signal per period (0–100%). The block clips the minimum signal to 0% and the maximum signal
     * to 100%.
     */
    private Double dutyCycle = 50.0;
}

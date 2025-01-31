package dev.slimevr.tracking.trackers

import io.github.axisangles.ktmath.Quaternion

class QuaternionTemporalityHandler(var temporalQuaternion: Quaternion = Quaternion.IDENTITY) {

	fun dataTick(q: Quaternion) {
		temporalQuaternion = q.twinNearest(temporalQuaternion)
	}

	fun reset(q: Quaternion) {
		temporalQuaternion = q
	}
}

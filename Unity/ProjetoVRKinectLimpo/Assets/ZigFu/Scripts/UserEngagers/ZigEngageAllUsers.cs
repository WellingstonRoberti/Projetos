using UnityEngine;
using System.Collections;
using System.Collections.Generic;

public class ZigEngageAllUsers : MonoBehaviour {


	Dictionary<int, GameObject> objects = new Dictionary<int, GameObject>();

	void Zig_UserFound(ZigTrackedUser user) 
	{
		GameObject o = GameObject.Find ("FPSController(Clone)");
		objects[user.Id] = o;
		user.AddListener(o);
	}

	void Zig_UserLost(ZigTrackedUser user)
	{

	}
}

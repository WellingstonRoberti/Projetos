using UnityEngine;
using System.Collections;

public class RespawnMeteoro : MonoBehaviour {

	public GameObject meteoro;
	public Transform spawnDoMeteoro;

	void Start () 
	{
		InvokeRepeating ("spawn", 0.0f, 10.0f);
	}
	void spawn() {
		Instantiate (meteoro, spawnDoMeteoro.position, spawnDoMeteoro.rotation);
	}

	// Update is called once per frame
	void Update () 
	{
		
	}
}


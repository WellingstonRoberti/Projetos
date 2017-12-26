using UnityEngine;
using System.Collections;

public class Tempo : MonoBehaviour {
	public static double tempo1;
	// Use this for initialization
	void Start () {
		tempo1 = 0;
	}
	
	// Update is called once per frame
	void Update () {
		if(Escudo.Escudao == 0)
			tempo1 = tempo1 + Time.deltaTime;
	}
}

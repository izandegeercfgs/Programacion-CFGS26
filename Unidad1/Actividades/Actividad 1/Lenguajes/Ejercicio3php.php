<?php
	$stdin = fopen('php://stdin', 'r');
	$contador = 10;
	$suma = 0;
	while ($contador>0) {
		echo '> Te quedan ', $contador, ' números por escribir para poder sumarlos.', PHP_EOL;
		fscanf($stdin, "%f", $num);
		$suma = $suma+$num;
		$contador = $contador-1;
	}
	echo 'El resultado es: ', $suma, PHP_EOL;
?>

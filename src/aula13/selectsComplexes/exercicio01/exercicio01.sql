SELECT cli.id_cliente, cli.nome, COUNT(ped.id_pedido) AS total_pedidos
FROM clientes cli
INNER JOIN pedidos ped ON cli.id_cliente = ped.cliente_id
GROUP BY cli.id_cliente, cli.nome
HAVING COUNT(ped.id_pedido) > 3;
SELECT cli.nome, SUM(ped.valor_total) AS vaalor_total_pedidos
FROM clientes cli
INNER JOIN pedidos ped ON cli.id_cliente = ped.cliente_id
GROUP BY cli.nome;

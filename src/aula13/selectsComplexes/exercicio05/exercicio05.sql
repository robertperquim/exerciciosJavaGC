SELECT
  ROUND((AVG(preco))::numeric, 2) AS media_precos,
  ROUND ((PERCENTILE_CONT(0.5) WITHIN GROUP (ORDER BY preco))::numeric, 2) AS mediana_precos,
  ROUND ((STDDEV_SAMP(preco)):: numeric, 2) AS desvio_padrao_precos
FROM produtos;
